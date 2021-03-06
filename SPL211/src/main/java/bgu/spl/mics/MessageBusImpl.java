package java.bgu.spl.mics;

import jdk.vm.ci.code.site.Call;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * The {@link MessageBusImpl class is the implementation of the MessageBus interface.
 * Write your implementation here!
 * Only private fields and methods can be added to this class.
 */
public class MessageBusImpl implements MessageBus {

	private static MessageBusImpl instance;
	private ArrayList<MicroService> registeredMicroservice;
	private ArrayList<PriorityQueue<Message>> microserviceQueue;

	private MessageBusImpl()
	{
		instance = getInstance();
		registeredMicroservice = new ArrayList<>();
		microserviceQueue = new ArrayList<PriorityQueue<Message>>();
	}

	//synchronized method to control simultaneous access
	synchronized public static MessageBusImpl getInstance()
	{
		if (instance == null)
		{
			// if instance is null, initialize
			instance = new MessageBusImpl();
		}
		return instance;
	}

	@Override
	public <T> void subscribeEvent(Class<? extends Event<T>> type, MicroService m) {
		//m.subscribeEvent(type, );
	}

	@Override
	public void subscribeBroadcast(Class<? extends Broadcast> type, MicroService m) {

    }

	@Override @SuppressWarnings("unchecked")
	public <T> void complete(Event<T> e, T result) {
		//?
	}

	@Override
	public void sendBroadcast(Broadcast b) {
		//foreach(,icroservice subscribed to b)
			//microservice.broadcast
	}

	
	@Override
	public <T> Future<T> sendEvent(Event<T> e) {
		// microservice uses method to add the event to a different subscribed microservice
        return null;
	}

	@Override
	public void register(MicroService m) {
		registeredMicroservice.add(m);
		//add queue
		microserviceQueue.add(new PriorityQueue<Message>());
	}

	@Override
	public void unregister(MicroService m) {
		int i = registeredMicroservice.indexOf(m);
		registeredMicroservice.remove(i);
		//remove queue
		microserviceQueue.remove(i);
	}

	@Override
	public Message awaitMessage(MicroService m) throws InterruptedException {
		int index = registeredMicroservice.indexOf(m);
		// throw exception???
		while(microserviceQueue.get(index).isEmpty()){
			wait();
		}
		Message mes = microserviceQueue.get(index).peek();
		microserviceQueue.get(index).remove(mes);
		return mes;
	}
}
