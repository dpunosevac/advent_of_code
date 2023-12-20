use std::fs;

pub fn load(data_dir: &str, year: u16, day: u8) -> String {
    load_raw(data_dir, year, day).trim().replace('\r', "")
}

pub fn load_raw(data_dir: &str, year: u16, day: u8) -> String {
    let file = format!("{}/year{}/day_{:02}.txt", data_dir, year, day);
    fs::read_to_string(&file).unwrap_or_else(|_| panic!("Error reading file {}", file))
}
