package com.ywh.dp.composite;

import java.util.List;


/**
 * 叶子结点类
 */
public class File extends Root{
    public File(String name){
        super(name);
    }

    @Override
    public void addFile(Root root) {

    }

    @Override
    public void removeFile(Root root) {

    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < depth;i++){
            sb.append("-");
        }
        // 打印横线和当前文件名
        System.out.println(new String(sb) + this.getName());
    }
}
