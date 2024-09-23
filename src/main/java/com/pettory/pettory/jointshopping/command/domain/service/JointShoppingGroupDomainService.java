package com.pettory.pettory.jointshopping.command.domain.service;

import com.pettory.pettory.jointshopping.command.application.dto.jointShoppingGroupCreateRequest;
import com.pettory.pettory.jointshopping.command.application.dto.jointShoppingGroupUpdateRequest;
import com.pettory.pettory.jointshopping.command.domain.aggregate.JointShoppingGroup;
import com.pettory.pettory.jointshopping.command.domain.repository.JointShoppingGroupRepository;
import com.pettory.pettory.jointshopping.command.mapper.JointShoppingGroupMapper;
import com.pettory.pettory.jointshopping.exception.NotFoundException;
import com.pettory.pettory.jointshopping.util.FileUploadUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class JointShoppingGroupDomainService {

    private String IMAGE_URL = "http://localhost:8080/joint-shopping-groupimgs/";
    private String IMAGE_DIR = "src/main/resources/static/jointShoppingGroupImgs";

    private final JointShoppingGroupRepository jointShoppingGroupRepository;

    /* 도메인 객체를 생성하는 로직 */
    public JointShoppingGroup createGroup(jointShoppingGroupCreateRequest groupRequest, MultipartFile productImg) {

        /* 전달 된 파일을 서버의 지정 경로에 저장 */
        String replaceFileName = FileUploadUtils.saveFile(IMAGE_DIR, productImg);

        /* dto to entity */
        JointShoppingGroup newJointShoppingGroup = JointShoppingGroupMapper.toEntity(groupRequest, IMAGE_DIR + replaceFileName);

        return newJointShoppingGroup;
    }

    /* 도메인 객체를 저장하는 로직 */
    public JointShoppingGroup saveGroup(JointShoppingGroup jointShoppingGroup) {
        return jointShoppingGroupRepository.save(jointShoppingGroup);
    }

    /* 도메인 객체를 수정하는 로직 */
    public void updateGroup(Long jointShoppingGroupNum, jointShoppingGroupUpdateRequest productRequest, MultipartFile productImg) {

        JointShoppingGroup jointShoppingGroup = jointShoppingGroupRepository.findById(jointShoppingGroupNum)
                .orElseThrow(() -> new NotFoundException("해당 코드에 맞는 상품이 없습니다. code : " + jointShoppingGroupNum));

        /* 이미지 수정이 필요할 경우 새로운 이미지 저장 후 기존 이미지 삭제 */
        if(productImg != null) {
            String replaceFileName = FileUploadUtils.saveFile(IMAGE_DIR, productImg);
            FileUploadUtils.deleteFile(IMAGE_DIR, jointShoppingGroup.getJointShoppingProductsFileDirectory().replace(IMAGE_DIR, ""));
            jointShoppingGroup.changejointShoppingProductsFileDirectory(IMAGE_DIR + replaceFileName);
        }

        /* 수정을 위해 엔터티 정보 변경 */
        jointShoppingGroup.update(
                productRequest.getJointShoppingGroupName(),
                productRequest.getJointShoppingProducts(),
                productRequest.getJointShoppingInfo(),
                productRequest.getJointShoppingCost(),
                productRequest.getJointShoppingGroupMaximumCount(),
                productRequest.getJointShoppingParticipationMaximumCount(),
                productRequest.getHostInvoiceNum(),
                productRequest.getJointShoppingCategoryNum(),
                productRequest.getUserId()
        );
    }

    /* 도메인 객체를 삭제하는 로직 */
    public void deleteGroup(Long jointShoppingGroupNum) {
        /* soft delete 될 수 있도록 entity에 설정함 */
        jointShoppingGroupRepository.deleteById(jointShoppingGroupNum);
    }
}
