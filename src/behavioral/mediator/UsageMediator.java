package behavioral.mediator;

import behavioral.mediator.implemenation.Client;
import behavioral.mediator.implemenation.Dispatcher;
import behavioral.mediator.implemenation.DispatcherMediator;
import behavioral.mediator.implemenation.Driver;

public class UsageMediator {
    public static void start(){
        DispatcherMediator mediator = new DispatcherMediator();

        Client client = new Client(mediator);
        Driver driver = new Driver(mediator);
        Dispatcher dispatcher = new Dispatcher(mediator);

        mediator.addColleague(client);
        mediator.addColleague(driver);
        mediator.addColleague(dispatcher);

        client.send("I need a taxi.");
        driver.send("I am available for a ride.");
        dispatcher.send("Please assign a driver to this client.");
    }
}
