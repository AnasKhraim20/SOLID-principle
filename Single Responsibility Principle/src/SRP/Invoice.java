package SRP;

import java.util.Date;

public class Invoice {

    private IConectToDB connect;

    public IConectToDB getConnect(IConectToDB connect) {
        IConectToDB Connect = connect;
        return Connect;
    }

    public void setConnect(IConectToDB connect) {
        this.connect = connect;
    }

    public IEmailSender getSend() {
        return send;
    }

    public void setSend(IEmailSender send) {
        this.send = send;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    private IEmailSender send;
    private long amount;
    private Date invoiceDate;
//composition Relation
    public Invoice(long amount, Date invoiceDate) {
        this.amount = amount;
        this.invoiceDate = invoiceDate;
    }

    public IConectToDB getConnect() {
        return connect;
    }

    public MailMessage getMailMessage() {
        return mailMessage;
    }

    public void setMailMessage(MailMessage mailMessage) {
        this.mailMessage = mailMessage;
    }

    MailMessage mailMessage = new MailMessage("MailAddressFrom","MailAddressTo","MailSubject","MailBody");
    //composition Relation

    public void sendEmail(MailMessage mailMessage)  {
        if (mailMessage.isValidMessage()){
            // Code for getting Email setting and send invoice mail
        } else {
            //show error message for the user
        }

    }
    public void add(){
        connect.connectForAdd();
        send.Emailsender(mailMessage);

    }
    public void delete(){
        connect.connectForDelete();
    }
    public void Emailsend(){
        send.Emailsender(mailMessage);
    }

}
