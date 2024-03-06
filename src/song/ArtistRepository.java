package song;

import util.Utility;

import java.io.*;
import java.util.*;

public class ArtistRepository {

	// key : 가수 이름, value : Artist 객체
	private static Map<String, Artist> artistList;

	static {
		artistList = new HashMap<>();
	}

	public static Map<String, Artist> getArtistList() {
		return artistList;
	}

	// 새로운 가수를 map에 추가하는 기능
	public void addNewArtist(String artistName, String songName) {
		// 1. 신규 가수 정보 생성
		Artist artist = new Artist(artistName, new HashSet<>());
		// 2. 노래 이름 추가
		artist.getSongList().add(songName);
		// 3. 완성된 객체를 Map에 저장
		artistList.put(artistName, artist);
	}

	/**
	 * 기존 가수 정보에 노래만 추가하는 기능
	 *
	 * @param artistName 사용자의 입력 가수 이름
	 * @param songName   사용자의 입력 노래 이름
	 * @return 정상적으로 곡이 추가되었다면 true, 곡명이 중복되었다면 false
	 */
	public boolean addNewSong(String artistName, String songName) {
		// Map에서 기존 가수 객체 찾기
		Artist artist = artistList.get(artistName);
		// Set의 add는 실행 결과를 boolean으로 리턴
		boolean flag = artist.getSongList().add(songName);
		return flag;
	}

	// 가수명을 전달받아 현재 등록된 가수인지 여부 리턴
	public boolean isRegisted(String artistName) {
		return artistList.containsKey(artistName);
	}

	public void showSongList(String artistName) {
		Set<String> list = artistList.get(artistName).getSongList();
		List<String> songs = new ArrayList<>(list);

		for (int i = 0; i < songs.size(); i++) {
			System.out.printf("* %d. %s\n", i + 1, songs.get(i));
		}
	}

	// 세이브 기능
	public void saveData() {
		// 폴더 경로는 Utility 클래스에 상수로 선언되어있음
		// 폴더가 실존하지 않는 경우 폴더 생성하고 세이브 파일 생성
		// 파일명은 song.sav로 진행

		File file = new File(Utility.FILE_PATH);
		if (!file.exists()) {
			file.mkdirs();
		}

		try (FileOutputStream fos = new FileOutputStream(Utility.FILE_PATH + "/song.sav")) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(artistList);
			System.out.println("저장이 완료되었습니다");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 로드 기능
	public void loadData() {
		// 세이브 파일이 존재하는지 체크
		// 존재한다면 로드를 진행해서 artistList에 할당
		File file = new File(Utility.FILE_PATH + "/song.sav");
		if (file.exists()) {
			try (FileInputStream fis = new FileInputStream(Utility.FILE_PATH + "/song.sav")) {
				ObjectInputStream ois = new ObjectInputStream(fis);
				artistList = (Map<String, Artist>) ois.readObject();

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("로드할 세이브 파일 없음");
		}
	}
}
