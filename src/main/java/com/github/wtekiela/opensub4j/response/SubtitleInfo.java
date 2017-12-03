/**
 * Copyright (c) 2017 Wojciech Tekiela
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.github.wtekiela.opensub4j.response;

@SuppressWarnings("javadoc")
public class SubtitleInfo {
	/* 
{SubActualCD=1, MovieName=Summertime, SubBad=0, MovieHash=0, SubFileName=Summertime (1955).srt, SubSumCD=1, 
	 ZipDownloadLink=https://dl.opensubtitles.org/en/download/src-api/vrf-f5380bb3/sid-kDwACy,jVenDV2gO51,8kwv-EV4/sub/4623461,
	 MovieNameEng=Summer Madness, 
	 SubSize=58200, IDSubtitleFile=1953171277, SubHash=f90fa623d875d4013a61959d4d03a791, SubFeatured=0, SubAuthorComment=, 
	 SubDownloadsCnt=3624, SubAddDate=2012-07-23 00:07:34, SubLastTS=01:37:47, SubAutoTranslation=0, 
	 MovieReleaseName= Summertime (1955), SeriesIMDBParent=0, Score=10.03624, UserNickName=, SubHearingImpaired=0, SubTSGroup=3, 
	 QueryCached=1, SubLanguageID=eng, SubFormat=srt, LanguageName=English, SubTranslator=, SeriesEpisode=0, UserRank=, 
	 MovieImdbRating=7.5, MovieTimeMS=0, MovieYear=1955, SubEncoding=ASCII, QueryNumber=0, SubHD=0, UserID=0, MovieByteSize=0, 
	 MovieFPS=23.976, SubtitlesLink=http://www.opensubtitles.org/en/subtitles/4623461/sid-kDwACy,jVenDV2gO51,8kwv-EV4/summertime-en, IDSubMovieFile=0, ISO639=en, SeriesSeason=0, 
	 SubFromTrusted=0, SubTSGroupHash=1427bd18cd0e1d441f2fbb5e67c6319a, MatchedBy=imdbid, 
	 SubDownloadLink=https://dl.opensubtitles.org/en/download/src-api/vrf-19a30c54/sid-kDwACy,jVenDV2gO51,8kwv-EV4/file/1953171277.gz, 
	 SubSumVotes=0, SubRating=0.0, QueryParameters={imdbid=0048673, sublanguageid=eng},
 	 SubComments=0, MovieKind=movie, IDMovie=7047, 
	 IDMovieImdb=48673, SubForeignPartsOnly=0, IDSubtitle=4623461}, 

{SubActualCD=1, MovieName=Summertime, SubBad=0, MovieHash=0, 
	 SubFileName=summertime.1955.720p.bluray.x264-publichd.srt, SubSumCD=1, ZipDownloadLink=https://dl.opensubtitles.org/en/download/src-api/vrf-f5590bbc/sid-kDwACy,jVenDV2gO51,8kwv-EV4/sub/5447942, MovieNameEng=Summer Madness, SubSize=58052, IDSubtitleFile=1954046294, 
	 SubHash=2c0b98148d4a1feeda30b3b6ab0432c8, SubFeatured=0, SubAuthorComment=, SubDownloadsCnt=1393, 
	 SubAddDate=2013-12-17 23:49:33, SubLastTS=01:37:58, SubAutoTranslation=0,  MovieReleaseName= summertime.1955.720p.bluray.x264-publichd, SeriesIMDBParent=0, Score=11.01393, 
	 UserNickName=osser, SubHearingImpaired=0, SubTSGroup=2, QueryCached=1, SubLanguageID=eng, SubFormat=srt, 
	 LanguageName=English, SubTranslator=, SeriesEpisode=0, UserRank=sub leecher, MovieImdbRating=7.5, MovieTimeMS=0, 
	 MovieYear=1955, SubEncoding=ASCII, QueryNumber=0, SubHD=1, UserID=2034896, MovieByteSize=0, 
	 MovieFPS=0.000, SubtitlesLink=http://www.opensubtitles.org/en/subtitles/5447942/sid-kDwACy,jVenDV2gO51,8kwv-EV4/summertime-en, 
	 IDSubMovieFile=0, ISO639=en, SeriesSeason=0, SubFromTrusted=0, SubTSGroupHash=3801a9aa0d2b8a71de76de93380d22d1, 
	 MatchedBy=imdbid, SubDownloadLink=https://dl.opensubtitles.org/en/download/src-api/vrf-19aa0c55/sid-kDwACy,jVenDV2gO51,8kwv-EV4/file/1954046294.gz, 
	 SubSumVotes=0, SubRating=0.0, QueryParameters={imdbid=0048673, sublanguageid=eng}, SubComments=0, MovieKind=movie, IDMovie=7047, IDMovieImdb=48673, 
	 SubForeignPartsOnly=0, IDSubtitle=5447942}, 

{SubActualCD=1, MovieName=Summertime, SubBad=0, MovieHash=0, SubFileName=summertime.1955.720p.bluray.x264-publichd.srt, SubSumCD=1, ZipDownloadLink=https://dl.opensubtitles.org/en/download/src-api/vrf-f54e0bbf/sid-kDwACy,jVenDV2gO51,8kwv-EV4/sub/7119497, 
	MovieNameEng=Summer Madness, SubSize=58052, IDSubtitleFile=1955700721, SubHash=97d036de3174346c8ccabd361a63213d, SubFeatured=0, SubAuthorComment=, SubDownloadsCnt=27, 
	SubAddDate=2017-10-08 22:33:08, SubLastTS=01:37:59, SubAutoTranslation=0, MovieReleaseName= summertime.1955.720p.bluray.x264-publichd, SeriesIMDBParent=0, Score=10.00027, UserNickName=, SubHearingImpaired=0, SubTSGroup=2, QueryCached=1, SubLanguageID=eng, SubFormat=srt, LanguageName=English, SubTranslator=, SeriesEpisode=0, UserRank=, MovieImdbRating=7.5, MovieTimeMS=0, MovieYear=1955, SubEncoding=ASCII, QueryNumber=0, SubHD=1, UserID=0, MovieByteSize=0, 
	MovieFPS=23.976, SubtitlesLink=http://www.opensubtitles.org/en/subtitles/7119497/sid-kDwACy,jVenDV2gO51,8kwv-EV4/summertime-en, IDSubMovieFile=0, ISO639=en, SeriesSeason=0, SubFromTrusted=0, SubTSGroupHash=3801a9aa0d2b8a71de76de93380d22d1, MatchedBy=imdbid, SubDownloadLink=https://dl.opensubtitles.org/en/download/src-api/vrf-19ad0c4e/sid-kDwACy,jVenDV2gO51,8kwv-EV4/file/1955700721.gz, SubSumVotes=0, SubRating=0.0, QueryParameters={imdbid=0048673, sublanguageid=eng}, SubComments=0, MovieKind=movie, IDMovie=7047, IDMovieImdb=48673, SubForeignPartsOnly=0, IDSubtitle=7119497}],
[SubtitleInfo{id=4623461, subtitleFileId=1953171277, downloadsNo=3624, language='English', fileName='Summertime (1955).srt', format='srt', osLink='http://www.opensubtitles.org/en/subtitles/4623461/sid-kDwACy,jVenDV2gO51,8kwv-EV4/summertime-en', downloadLink='https://dl.opensubtitles.org/en/download/src-api/vrf-19a30c54/sid-kDwACy,jVenDV2gO51,8kwv-EV4/file/1953171277.gz', zipDownloadLink='https://dl.opensubtitles.org/en/download/src-api/vrf-f5380bb3/sid-kDwACy,jVenDV2gO51,8kwv-EV4/sub/4623461', encoding='ASCII'}, 
 SubtitleInfo{id=5447942, subtitleFileId=1954046294, downloadsNo=1393, language='English', fileName='summertime.1955.720p.bluray.x264-publichd.srt', format='srt', osLink='http://www.opensubtitles.org/en/subtitles/5447942/sid-kDwACy,jVenDV2gO51,8kwv-EV4/summertime-en', downloadLink='https://dl.opensubtitles.org/en/download/src-api/vrf-19aa0c55/sid-kDwACy,jVenDV2gO51,8kwv-EV4/file/1954046294.gz', zipDownloadLink='https://dl.opensubtitles.org/en/download/src-api/vrf-f5590bbc/sid-kDwACy,jVenDV2gO51,8kwv-EV4/sub/5447942', encoding='ASCII'}, 
 SubtitleInfo{id=7119497, subtitleFileId=1955700721, downloadsNo=27, language='English', fileName='summertime.1955.720p.bluray.x264-publichd.srt', format='srt', osLink='http://www.opensubtitles.org/en/subtitles/7119497/sid-kDwACy,jVenDV2gO51,8kwv-EV4/summertime-en', downloadLink='https://dl.opensubtitles.org/en/download/src-api/vrf-19ad0c4e/sid-kDwACy,jVenDV2gO51,8kwv-EV4/file/1955700721.gz', zipDownloadLink='https://dl.opensubtitles.org/en/download/src-api/vrf-f54e0bbf/sid-kDwACy,jVenDV2gO51,8kwv-EV4/sub/7119497', encoding='ASCII'}
]}
	*/
    @OpenSubtitlesApiSpec(fieldName = "IDSubtitle")
    private int id;

    @OpenSubtitlesApiSpec(fieldName = "IDSubtitleFile")
    private int subtitleFileId;

    @OpenSubtitlesApiSpec(fieldName = "SubDownloadsCnt")
    private int downloadsNo;

    @OpenSubtitlesApiSpec(fieldName = "LanguageName")
    private String language;

    @OpenSubtitlesApiSpec(fieldName = "SubFileName")
    private String fileName;

    @OpenSubtitlesApiSpec(fieldName = "SubFormat")
    private String format;

    @OpenSubtitlesApiSpec(fieldName = "SubtitlesLink")
    private String osLink;

    @OpenSubtitlesApiSpec(fieldName = "SubDownloadLink")
    private String downloadLink;

    @OpenSubtitlesApiSpec(fieldName = "ZipDownloadLink")
    private String zipDownloadLink;

    @OpenSubtitlesApiSpec(fieldName = "SubEncoding")
    private String encoding;
    
    /* newly added */
    
    @OpenSubtitlesApiSpec(fieldName = "SubFormat")
    private String subFormat;

	@OpenSubtitlesApiSpec(fieldName = "SubActualCD")
    private String subactualCDs;
    
    @OpenSubtitlesApiSpec(fieldName = "MovieReleaseName")
    private String movieReleaseName;
    
    @OpenSubtitlesApiSpec(fieldName = "SubHearingImpaired")
    private String subHearingImpaired;
    
    @OpenSubtitlesApiSpec(fieldName = "SubHD")
    private String subHD;
    
    @OpenSubtitlesApiSpec(fieldName = "MovieFPS")
    private String movieFPS;
    
    @OpenSubtitlesApiSpec(fieldName = "SeriesEpisode")
    private String seriesEpisode;
    
    

    /**
     * 
     */
    public SubtitleInfo() {
    }

    /*
	public SubtitleInfo(int id, int subtitleFileId, String language, String fileName, String format, int downloadsNo,
                        String osLink, String downloadLink, String zipDownloadLink, String encoding) {
        this.id = id;
        this.subtitleFileId = subtitleFileId;
        this.language = language;
        this.fileName = fileName;
        this.format = format;
        this.downloadsNo = downloadsNo;
        this.osLink = osLink;
        this.downloadLink = downloadLink;
        this.zipDownloadLink = zipDownloadLink;
        this.encoding = encoding;
    }*/


    public int getId() {
        return id;
    }


    public int getSubtitleFileId() {
        return subtitleFileId;
    }


    public int getDownloadsNo() {
        return downloadsNo;
    }


    public String getLanguage() {
        return language;
    }


    public String getFileName() {
        return fileName;
    }


    public String getFormat() {
        return format;
    }


    public String getOsLink() {
        return osLink;
    }


    public String getDownloadLink() {
        return downloadLink;
    }


    public String getZipDownloadLink() {
        return zipDownloadLink;
    }


    public String getEncoding() {
        return encoding;
    }
    
	public String getSubFormat() {
		return subFormat;
	}

	public String getMovieReleaseName() {
		return movieReleaseName;
	}

	public String getSubHearingImpaired() {
		return subHearingImpaired;
	}

	public String getSubHD() {
		return subHD;
	}

	public String getMovieFPS() {
		return movieFPS;
	}

	public String getSeriesEpisode() {
		return seriesEpisode;
	}

    @Override
    public String toString() {
        return "SubtitleInfo{" +
                "id=" + id +
                ", subtitleFileId=" + subtitleFileId +
                ", downloadsNo=" + downloadsNo +
                ", language='" + language + '\'' +
                ", fileName='" + fileName + '\'' +
                ", format='" + format + '\'' +
                ", osLink='" + osLink + '\'' +
                ", downloadLink='" + downloadLink + '\'' +
                ", zipDownloadLink='" + zipDownloadLink + '\'' +
                ", \nencoding='" + encoding + '\'' +
                
                ", subFormat='" + subFormat + '\'' +
                ", subactualCDs='" + subactualCDs + '\'' +
                ", movieReleaseName='" + movieReleaseName + '\'' +
                ", subHearingImpaired='" + subHearingImpaired + '\'' +
                ", subHD='" + subHD + '\'' +
                ", movieFPS='" + movieFPS + '\'' +
                ", seriesEpisode='" +seriesEpisode + '\'' +
                '}';
    }
}
