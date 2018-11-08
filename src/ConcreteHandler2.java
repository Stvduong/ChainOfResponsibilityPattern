public class ConcreteHandler2 extends Handler {

    @Override
    public void SetSuccessor(Handler successor) {
        super.SetSuccessor(successor);
    }

    @Override
    public void HandleRequest(int request) {
        if (request >= 10 && request < 20)
        {
            System.out.println("Handler2 handled request " + request);
        }
        else if (successor != null)
        {
            successor.HandleRequest(request);
        }
    }
}
