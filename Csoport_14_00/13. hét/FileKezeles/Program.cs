using FileKezeles;

var lines = FileUtils.ReadLines("test.txt");

FileUtils.WriteLines("out.txt", lines);