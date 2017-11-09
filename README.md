## Web Scraper

#### Description

Create console [web scraper](http://en.wikipedia.org/wiki/Web_scraping) utility which accepts as command line parameters:

#### Arguments

| Description | Format | Example | Required  |
| --- | --- | --- | --- |
| Web resources URL or path to plain text file containing a list of URLs | hyperlink or local path |  https://en.wikipedia.org/wiki/Google /home/user/plain.text | + |
| Data command | word (or list of words with “,” delimiter) | Microsoft,Apple | + |
| Output verbosity flag,  if on then the output should contains information about time spend on data scraping and data processing | Flag | -v | - |
| Count number of provided word(s) occurrence on webpage(s) | Flag | -w | - |
| Count number of characters of each web page | Flag | -c | - |
| Extract sentences’ which contain given words | Flag | -e | - |
 
Data processing results should be printed to output for each web resources separately and for all resources as total.

#### Example of usages 

```sh
java –jar scraper.jar https://en.wikipedia.org/wiki/Google Microsoft,Apple –v –w –c –e
```