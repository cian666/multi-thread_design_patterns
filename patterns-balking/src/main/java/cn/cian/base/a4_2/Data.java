package cn.cian.base.a4_2;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

@Slf4j
public class Data {
    private final String fileName;
    private String content;
    private boolean changed;

    public Data(String fileName) {
        this.fileName = fileName;
    }
    public synchronized void change(String newContent){
        content = newContent;
        changed = true;
    }
    public synchronized void save() throws IOException {
        if(!changed){
            return;
        }
        doSave();
        changed = false;
    }

    private void doSave() throws IOException {
        log.info("calls save,the content is " + content);
        Writer writer = new FileWriter(new File(fileName));
        writer.write(content);
        writer.close();
    }

}
