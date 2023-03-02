public class CourseModel {
    String title, code, cb_price, nbu_buy_price, nbu_cell_price, date;

    public CourseModel(String title, String code, String cb_price, String nbu_buy_price, String nbu_cell_price, String date) {
        this.title = title;
        this.code = code;
        this.cb_price = cb_price;
        this.nbu_buy_price = nbu_buy_price;
        this.nbu_cell_price = nbu_cell_price;
        this.date = date;
    }
}
