package yuripapago.designpattern.command;

import org.junit.Test;


public class FtpClientTest {

    @Test
    public void test() {
        FtpClient client = new FtpClient();
        client.setFtpCommand(new UploadCommand());
        client.execute();

        client.setFtpCommand(new DownloadCommand());
        client.execute();
    }

    @Test
    public void test2() {
        FtpClient client = new FtpClient();
        client.setFtpCommand(() -> System.out.println("put file to remote ftp server"));
        client.execute();

        client.setFtpCommand(() -> System.out.println("get file from remote ftp server"));
        client.execute();
    }
}
