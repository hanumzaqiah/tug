hanum
# Persegi Calculator

Persegi Calculator adalah sebuah kelas Java yang dirancang untuk menghitung keliling persegi berdasarkan panjang sisi yang diberikan. README ini memberikan gambaran umum tentang kelas tersebut, instruksi cara menggunakannya, informasi penting, dan contoh penggunaannya.

## Deskripsi

Kelas `PersegiCalculator` adalah sebuah utilitas sederhana untuk melakukan perhitungan terkait persegi. Kelas ini menyediakan fitur berikut:

- **Konstruktor**: Anda dapat membuat instance dari `PersegiCalculator` dengan menentukan panjang sisi persegi yang diinginkan.
- **Metode `hitungKeliling()`**: Metode ini menghitung dan mengembalikan keliling persegi.
- **Metode `getPanjangSisi()`**: Metode ini memungkinkan Anda untuk mendapatkan panjang sisi persegi saat ini.
- **Metode `setPanjangSisi()`**: Anda dapat menggunakan metode ini untuk mengubah panjang sisi persegi.

## Cara Menggunakan

Ikuti langkah-langkah berikut untuk menggunakan kelas `PersegiCalculator`:

1. Buat sebuah instance dari `PersegiCalculator` dengan menyediakan panjang sisi yang diinginkan.
2. Gunakan metode `hitungKeliling()` untuk menghitung keliling persegi.
3. Untuk mengubah panjang sisi, gunakan metode `setPanjangSisi()`.
4. Untuk mendapatkan panjang sisi saat ini, gunakan metode `getPanjangSisi()`.

### Contoh

```java
PersegiCalculator persegi = new PersegiCalculator(5.0);
double keliling = persegi.hitungKeliling();
System.out.println("Keliling persegi dengan panjang sisi " + persegi.getPanjangSisi() + " adalah " + keliling);
```

Pada contoh di atas, sebuah instance dari `PersegiCalculator` dibuat dengan panjang sisi 5.0. Keliling dihitung dan dicetak.

## Informasi Penting

- Panjang sisi harus berupa angka riil positif (double).
- Pastikan untuk menyertakan satuan yang sesuai untuk panjang sisi (misalnya, sentimeter, meter).
- Metode `hitungKeliling()` mengasumsikan bahwa persegi tersebut adalah persegi regular (semua sisi memiliki panjang yang sama). Jika sisi-sisinya tidak sama, perhitungan keliling tidak akan benar.
- Kelas ini hanya merupakan contoh pendidikan yang sederhana. Untuk perhitungan geometri yang lebih kompleks, pertimbangkan menggunakan pustaka atau kelas khusus.

Selamat menggunakan dan memodifikasi kelas ini dalam proyek Java Anda sesuai kebutuhan. Jika Anda memiliki pertanyaan atau saran perbaikan, jangan ragu untuk menghubungi kami.
