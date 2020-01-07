package yuripapago.designpattern.command;

public class FtpClient {

    private FtpCommand ftpCommand;

    public FtpClient() {

    }

    public FtpClient(FtpCommand ftpCommand) {
        this.ftpCommand = ftpCommand;
    }

    public void setFtpCommand(FtpCommand ftpCommand) {
        this.ftpCommand = ftpCommand;
    }


    public void execute() {
        ftpCommand.execute();
    }
}
