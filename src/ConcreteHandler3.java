public class ConcreteHandler3 extends Handler {

    @Override
    public void SetSuccessor(Handler successor) {
        super.SetSuccessor(successor);
    }

    @Override
    public void HandleRequest(int request) {
        if (request >= 20 && request < 30)
        {
            System.out.println("Handler3 handled request " + request);
        }
        else if (successor == null)
        {
            System.out.println("Request failed.");
        }
    }
}
