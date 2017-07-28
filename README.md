# Epochs-clojure

Convert various epoch times to java.time.Instant times in Clojure.

```bash
$ rlwrap lein repl
user=> (use 'epochs.core)
nil
user=> (unix 1234567890)
#object[java.time.Instant 0x663f76b "2009-02-13T23:31:30Z"]
user=> (google-calendar 1234567890)
#object[java.time.Instant 0xf53c7ad "2007-03-16T23:31:30Z"]
```

## Contributors

[@noppers](https://github.com/noppers) originally worked out how to do the Google Calendar calculation.

## See Also

This project was originally done in [Perl](https://github.com/oylenshpeegul/Time-Moment-Epoch). See [the Time::Moment::Epoch web page](http://oylenshpeegul.github.io/Time-Moment-Epoch/) for motivation.

There are also versions in:
- [Elixir](https://github.com/oylenshpeegul/Epochs-elixir)
- [Go](https://github.com/oylenshpeegul/epochs)
- [PowerShell](https://github.com/oylenshpeegul/Epochs-powershell)
- [Rust](https://github.com/oylenshpeegul/Epochs-rust)


## License

Copyright © 2017 oylenshpeegul

Distributed under the Eclipse Public License version 1.0.

