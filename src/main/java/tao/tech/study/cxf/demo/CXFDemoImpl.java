package tao.tech.study.cxf.demo;

public class CXFDemoImpl implements CXFDemo {

	@Override
	public String sayHello(String foo) {
		return "hello "+foo;
	}

}
