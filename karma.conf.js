process.env.CHROME_BIN = require('puppeteer').executablePath()

module.exports = function(config) {

  // console.log("@@@ KARMA/CONFIG", process.env.CHROME_BIN);

  config.set({
    browsers: ['ChromeHeadless']
  })
}
