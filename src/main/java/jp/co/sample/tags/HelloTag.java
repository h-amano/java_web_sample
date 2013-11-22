package jp.co.sample.tags;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport {

	private static final long serialVersionUID = 4554110350116164031L;

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return super.doEndTag();
	}

	@Override
	public int doStartTag() throws JspException {
		try {
			Calendar now = Calendar.getInstance(); // �C���X�^���X��
			int nowHour = now.get(now.HOUR_OF_DAY);// �����擾
			if (nowHour >= 0 && nowHour < 4) {
				this.pageContext.getOut().println("��X�����͑̂̓ł���");
			} else if (nowHour >= 4 && nowHour < 8) {
				this.pageContext.getOut().println("���N���͎O���̂Ƃ�");
			} else if (nowHour >= 8 && nowHour < 14) {
				this.pageContext.getOut().println("�d������ꂳ�܂ł�");
			} else if (nowHour >= 14 && nowHour < 19) {
				this.pageContext.getOut().println("�ߌ���撣���Ă�������");
			} else if (nowHour >= 19 && nowHour < 24) {
				this.pageContext.getOut().println("�������������ꂳ�܂ł���");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

}
