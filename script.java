<script>
    const playButton = document.getElementById("play-button");
    const videoIframe = document.querySelector("iframe");

    playButton.addEventListener("click", () => {
        videoIframe.src += "&autoplay=1";
        playButton.style.display = "none";
    });
</script>
