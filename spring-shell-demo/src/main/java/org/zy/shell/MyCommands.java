package org.zy.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class MyCommands {

    @ShellMethod(value = "Add two integers together .", key = "sum")
    public int add(int a, @ShellOption("--c") int b) {
        return a + b;
    }
}
