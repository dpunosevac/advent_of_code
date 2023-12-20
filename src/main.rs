use std::time::Instant;

use clap::Parser;

#[derive(Parser, Debug)]
#[command(author, version, about)]
struct Args {
    #[arg(default_value_t = String::from("input"), help="Directory with input data files.")]
    input_dir: String,
    #[arg(long, value_parser=clap::value_parser!(u16), help="Year of aoc")]
    year: Option<u16>,
    #[arg(long, help="Day of aoc")]
    day: Option<u8>
}

fn main() -> Result<(), &'static str> {
    let args = Args::parse();
    let start = Instant::now();
    match (args.year, args.day) {
        (Some(y), Some(d)) => {
            println!("Running puzzle year_{}_day_{}.", y, d);
            run_day(&args.input_dir, y, d);
        }
        (Some(y), None) => {
            println!("Running all puzzles for year {}.", y);
            run_year(&args.input_dir, y);
        }
        (None, Some(d)) | (None, None) => {
            return Err("Invalid parameters. You need to specific at least year to run.");
        }
    };
    let duration = start.elapsed();
    println!("Done! 🎉 -- Elapsed time: {:?}", duration);
    Ok(())
}
