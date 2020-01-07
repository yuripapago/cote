package yuripapago.designpattern.command;

public class Main {

    public static void main(String[] args) {
        FtpClient client = new FtpClient();
        client.setFtpCommand(new UploadCommand());

        client.execute();


        client.setFtpCommand(new DownloadCommand());
        client.execute();
    }
}
