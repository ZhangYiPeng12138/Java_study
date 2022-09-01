package OOPStudy_Interface_Proxy;

/**
 * 接口的应用：代理模式
 */
public class NetWorkTest {
    public static void main(String[] args) {
        server server = new server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}

interface NetWork{
    public abstract void browse();
}

//被代理类
class server implements NetWork{
    @Override
    public void browse() {
        System.out.println("真实服务器联网");
    }
}

//代理类
class ProxyServer implements NetWork{
    private NetWork work;
    public ProxyServer(NetWork work){
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }
}