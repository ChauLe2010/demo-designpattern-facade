public class Client {
    public void share(String message){
        SocialMediaFacade socialMediaFacade=new SocialMediaFacade(new Twitter(),new Facebook());
        socialMediaFacade.share(message);
    }
}
