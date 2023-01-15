
package proje;
import javax.swing.JOptionPane;

 
interface  Helper {
 static void showMesage(String str)
 {
 
	String msg;
	switch(str) {
	case "fill":
		msg="Lütfen Tüm alanları doldurunuz";
		break;
	case "succes":
		msg="işlem başarılı";
                break;
        case "yanlis":
                msg="Yanlış kullanıcı adı veya parola girdiniz";
                break;
	default:
		msg=str;
	}
	JOptionPane.showMessageDialog(null,msg,"Mesaj",JOptionPane.INFORMATION_MESSAGE);
}
 
 
 
 
 
 
 
 
 }	

