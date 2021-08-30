import com.tms.stringFormatter.StringToMyFormat;

public class Task_00 extends StringToMyFormat {
    public static void main(String[] args) {
        String docNumber = "1257-ABC-3948-abc-5b5c";
        String str2 = "";

        twoFirstNumericBlocks(docNumber, 2);
        twoFirstNumericBlocks(str2, 2);
        twoFirstNumericBlocks(null, 2);

        threeCharBlocksReplace(docNumber, 'X',4);

        onlyLetterIntoString(docNumber, '/');

        onlyLetterIntoStringByStringBuilder(docNumber,'/');


       checkCharSequence(docNumber, "abC");

        checkStringStart(docNumber,"555");

        checkStringEnd(docNumber,"1a2b");


    }

}
