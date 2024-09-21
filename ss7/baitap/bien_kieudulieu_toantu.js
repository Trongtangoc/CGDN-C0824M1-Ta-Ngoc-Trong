
function tinhDiemtrungbinh(){
    let diemToan = +prompt("Nhập điểm Toán");
    let diemLy = +prompt("Nhập điểm Lý");
    let diemHoa = +prompt("Nhập điểm Hóa");
    let TB = (diemToan + diemHoa + diemLy) / 3;
    document.getElementById("show diem trung binh").innerHTML = "Điểm trung bình là: " + TB + "<br>" + "Điểm toán là: " + diemToan + "<br>" + "Điểm Lý là: " + diemLy+ "<br>" + "Điểm Hóa là: " + diemHoa;

}