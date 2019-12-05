package cn.pzw.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * ȫ���쳣������
 * @author Steven
 *
 */
public class CustomerException implements  HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object hanlder, Exception e) {
		//��¼�ռ�
		e.printStackTrace();
		//������Ϣ
		String msg = "�ܱ�Ǹ��ϵͳ�����쳣�ˣ�����ϵ����Ա";
		//���Ϊ�Զ����쳣����ʾ�Զ�����Ϣ
		if(e instanceof MyException){
			  msg=((MyException) e).getMsg();
		}
		//��Ӧ������ʾ
		ModelAndView mav = new ModelAndView();
		//���ش�����Ϣ
		mav.addObject("msg", msg);
		//��Ӧ������ʾҳ��
		mav.setViewName("msg");
		return mav;
	}

}
