fn fibonacci (n: i32) -> i32 {
    if n <= 1 {
      return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

fn main () {
  println!("{}", fibonacci(8));
}
