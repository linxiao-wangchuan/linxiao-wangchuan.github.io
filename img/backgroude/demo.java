public class demo {
    public static void main(String[] args) throws IOException {
        // 目标:使用java写个等比例缩放脚本,输入名字,自动修改图片为缩略图片
        // https://blog.csdn.net/Ally441/article/details/88901379
        // https://cloud.tencent.com/developer/article/1811146
        // https://juejin.cn/post/7028597323563270175
        // https://blog.csdn.net/sdujava2011/article/details/117035635
        Thumbnails.of(new File("f:\\original.jpg"))
                .forceSize(200, 200)
                .toFile(new File("f:\\thumbnail.jpg"));
    }
}