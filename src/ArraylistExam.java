import java.util.ArrayList;

/**
 * Created by 호영 on 2016-01-25.
 */
public class ArraylistExam {
    public static void main(String[] args) {


        Picture pic1 = new Picture("degas1.jpg");
        Picture pic2 = new Picture("gaugin1.jpg");
        Picture pic3 = new Picture("monet1.jpg");
        Picture pic4 = new Picture("monet2.jpg");
        Picture pic5 = new Picture("renoir1.jpg");

        //ArrayList<Picture> 생성하고 add 하고
        ArrayList<Picture> list = new ArrayList<>();
        list.add(pic1);
        list.add(pic2);
        list.add(pic3);
        list.add(pic4);
        list.add(pic5);

        //getMaxX() : 오른쪽 끝의 x좌표
        //getWidth() : 가로 길이
        //translate(x, y) : x, y만큼 그림을 이동
        //System.out.println(pic1.getMaxX());

        // 사진의 좌표를 알 수 있다.
        //pic1.translate(0, 0);
        //System.out.println(pic1.getMaxX());
        //pic1.draw();

        // 사진의 사이즈를 확인 할 수 있다.
        // System.out.println(pic1.getWidth());

        // for 문으로 draw()
        // list 사이즈를 알고 싶으면 list.size();
//        for (int i = 0; i < list.size(); i++) {
//            Picture pic = list.get(i);
//            pic.draw();
//        }


        // 1.사진의 간격을 30씩 증가하여 출력하라.
//        int Width = -30;
//        for (int i = 0; i < list.size(); i++) {
//            Picture pic = list.get(i);
//            pic.translate(Width + 30, 0);
//            Width = pic.getMaxX();
//            pic.draw();
//        }


        // 2. 가로 길이의 총합
//        int Width = 0;
//        for (int i = 0; i < list.size(); i++) {
//            Picture pic = list.get(i);
//            pic.translate(Width + 0, 0);
//            Width = pic.getMaxX();
//            pic.draw();
//            System.out.println(pic.getMaxX());
//        }


        //  3.세로의 사진만 출력 하세요
//        int Width = -30;
//        for (int i = 0; i < list.size(); i++) {
//            Picture pic = list.get(i);
//            if (pic.getWidth() < pic.getHeight()) {
//                pic.translate(Width + 30, 0);
//                Width = pic.getMaxX();
//                pic.draw();
//
//            }
//
//        }


        // 4.세로의 사진수는??
//        int Width = -30;
//        int count = 0;
//        for (int i = 0; i < list.size(); i++) {
//            Picture pic = list.get(i);
//            if (pic.getWidth() < pic.getHeight()) {
//                count++;
//            }
//        }
//        System.out.println(count);


        // 5.세로의 사진 중에 첫번재 사진만 출력
//        int Width = 0;
//        for (int i = 0; i < list.size(); i++) {
//            Picture pic = list.get(i);
//            if (pic.getWidth() < pic.getHeight()) {
//                list.get(1).draw();
//            }
//        }


        // 6.세로의 사진만 찾아서 matches(ArrayList)에 저장

//        int Width = -30;
//        for (int i = 0; i < list.size(); i++) {
//            Picture pic = list.get(i);
//            if (pic.getWidth() < pic.getHeight()) {
//                pic.translate(Width + 30, 0);
//                Width = pic.getMaxX();
//                ArrayList<Picture> matches = new ArrayList<>();
//                matches.add(list.get(i));
//                pic.draw();
//
//            }
//
//        }

    }

}


