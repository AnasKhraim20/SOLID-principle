package NewClassesAfterSingleRes;

import SRP.MailMessage;
import SRP.IEmailSender;
public class EmailSender implements IEmailSender {

    @Override
    public void Emailsender(MailMessage mailMessage) {
        if (mailMessage.isValidMessage()){
            //Code to send Email & invoiceMail

        }
        else {
        //No Res :. There's an error
    }}
}
