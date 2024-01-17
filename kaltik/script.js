function calculate() {
    var sideLength = parseFloat(document.getElementById("sideLength").value);

    if (isNaN(sideLength) || sideLength <= 0) {
      alert("Masukkan panjang sisi yang valid.");
      return;
    }

    // Mengambil nilai radio button (luas atau keliling)
    var calculationType = document.querySelector('input[name="calculationType"]:checked').value;

    // Mendeklarasikan variabel untuk luas dan keliling
    var area, perimeter;

    // Memeriksa jenis perhitungan yang dipilih
    if (calculationType === "luas") {
      area = sideLength * sideLength;
      perimeter = null; // Tidak ada perhitungan keliling jika menghitung luas
    } else {
      // Jika menghitung keliling, gunakan panjang sisi yang sesuai
      perimeter = 4 * sideLength;
      area = null; // Tidak ada perhitungan luas jika menghitung keliling
    }

    var resultElement = document.getElementById("result");

    
    var resultHTML = `<p>Sisi = ${sideLength}</p>`;
    if (calculationType === "luas") {
      resultHTML += `<p>Sisi x Sisi : ${sideLength} x ${sideLength} = ${area}</p>`;
    } else {
      resultHTML += `<p>4 x Sisi : 4 x ${sideLength} = ${perimeter}</p>`;
    }

    resultElement.innerHTML = resultHTML;
  }

  function reset() {
    document.getElementById('sideLength').value = '';
    document.querySelector('input[name="calculationType"][value="luas"]').checked = true;
    document.getElementById('result').textContent = '';
  }