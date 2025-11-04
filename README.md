# Latihan-UKL-4
Tujuan:
Menghitung volume tabung (silinder) dari jari‑jari dan tinggi yang dimasukkan pengguna.

Input yang diminta:
jari‑jari (cm) — angka bertipe double
tinggi (cm) — angka bertipe double

Cara kerja:
1. Program membaca jari‑jari dan tinggi lewat Scanner.
2. Memeriksa apakah kedua nilai > 0; jika tidak, program memberi pesan dan berhenti.
3. Memanggil fungsi volumeTabung(jariJari, tinggi) yang menghitung volume dengan rumus π × r × r × t.
4. Mencetak hasil volume ke layar.
5. Menutup Scanner.

Penjelasan fungsi:
volumeTabung(double jariJari, double tinggi) mengembalikan nilai Math.PI * jariJari * jariJari * tinggi.

Contoh:
Jika input r = 7 dan t = 10 → volume ≈ 3.1416 * 7 * 7 * 10 ≈ 1539.38 cm³
