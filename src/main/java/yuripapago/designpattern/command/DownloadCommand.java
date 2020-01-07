package yuripapago.designpattern.command;


public class DownloadCommand implements FtpCommand {
    @Override
    public void execute() {
        System.out.println("put file from remote ftp server");
    }
}
