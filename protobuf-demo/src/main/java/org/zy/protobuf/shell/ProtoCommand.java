package org.zy.protobuf.shell;

import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.zy.protobuf.common.support.HydrogenUtil;
import org.zy.protobuf.service.EnvelopeService;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@ShellComponent
public class ProtoCommand {

    @Autowired
    private EnvelopeService envelopeService;


    @ShellMethod("generate envelope files")
    public String envelope(
            @ShellOption(defaultValue = "", value = "--in", help = "文件输入路径,默认当前目录下的data文件夹") String in,
            @ShellOption(defaultValue = "", value = "--out", help = "文件输出路径,默认当前目录下的envelope文件夹") String out
    ) {
        in = StrUtil.isBlank(in) ? System.getProperty("user.dir") + "\\data" : in;
        out = StrUtil.isBlank(out) ? System.getProperty("user.dir") + "\\envelope_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddhhmm")) : out;
        envelopeService.generateTwoFiles(in, out);
        return "执行成功!";
    }


    @ShellMethod("generate envelope files")
    public String command() throws IOException {
        String in = System.getProperty("user.dir") + "\\data";
        var command = envelopeService.getCommand(in);
        var commandFileOutputStream = new FileOutputStream("D:/command.bin");
        commandFileOutputStream.write(command);
        commandFileOutputStream.close();
        var sign = HydrogenUtil.sign(command);
        var signFileOutputStream = new FileOutputStream("D:/sign.bin");
        signFileOutputStream.write(sign);
        signFileOutputStream.close();
        return "执行成功!";
    }

}
