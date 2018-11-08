package test.company;

public class ConcreteHandler1 extends Handler {

    public Handler successor2;
    @Override
    public void SetSuccessor(Handler successor) {
        super.SetSuccessor(successor);
    }

    public void testing() {
        System.out.println("Testing");
    }

    @Override
    public void HandleRequest(int request) {
        if (request >= 0 && request < 10)
        {
            System.out.println("Handler1 handled request "
                    + request);
        }
        else if (successor != null)  //when this happen, successor becomes the instance of ConcreteHandler2.
        {                            //Next call will look like h2.HandleRequest(request) in the current instance.
            successor2.HandleRequest(request);
        }
    }
}
