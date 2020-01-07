package yuripapago.designpattern.command;

public class UploadCommand implements FtpCommand {
    @Override
    public void execute() {
        System.out.println("put file to remote ftp server");
    }
}
