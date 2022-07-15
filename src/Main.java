
import com.ywh.dp.command.*;
import com.ywh.dp.iterator.ICollection;
import com.ywh.dp.iterator.Iterator;
import com.ywh.dp.iterator.MyCollection;
import com.ywh.dp.memento.RoleOriginator;
import com.ywh.dp.memento.RoleStateCareTaker;
import com.ywh.dp.memento.RoleStateMemento;
import com.ywh.dp.state.NewOrderState;
import com.ywh.dp.state.OrderContext;
import com.ywh.dp.state.PayOrderState;
import com.ywh.dp.state.SendOrderState;


public class Main {
    public static void main(String [] args){
        OrderContext orderContext = new OrderContext();
        orderContext.setState(new NewOrderState());
        orderContext.setState(new PayOrderState());
        orderContext.setState(new SendOrderState());
    }
}
