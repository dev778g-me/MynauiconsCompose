package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.BuildingOne: ImageVector
    get() {
        if (_BuildingOne != null) {
            return _BuildingOne!!
        }
        _BuildingOne = ImageVector.Builder(
            name = "Filled.BuildingOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.233f, 1.25f)
                curveToRelative(0.812f, 0f, 1.469f, 0f, 2f, 0.045f)
                curveToRelative(0.55f, 0.047f, 1.033f, 0.145f, 1.48f, 0.381f)
                arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.633f, 1.692f)
                curveToRelative(0.223f, 0.454f, 0.316f, 0.944f, 0.36f, 1.507f)
                curveToRelative(0.044f, 0.549f, 0.044f, 1.227f, 0.044f, 2.072f)
                verticalLineToRelative(0.599f)
                horizontalLineToRelative(2.125f)
                curveToRelative(1.135f, 0f, 2.13f, 0.22f, 2.809f, 0.948f)
                curveToRelative(0.666f, 0.714f, 0.866f, 1.747f, 0.866f, 2.95f)
                verticalLineToRelative(9.806f)
                horizontalLineToRelative(1.2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1f)
                verticalLineTo(6.947f)
                curveToRelative(0f, -0.845f, 0f, -1.523f, 0.043f, -2.072f)
                curveToRelative(0.045f, -0.563f, 0.138f, -1.053f, 0.36f, -1.507f)
                arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.635f, -1.692f)
                curveToRelative(0.446f, -0.236f, 0.93f, -0.334f, 1.478f, -0.38f)
                curveToRelative(0.532f, -0.046f, 1.189f, -0.046f, 2f, -0.046f)
                close()
                moveTo(8f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
                moveTo(7.25f, 10f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineTo(8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                moveTo(8f, 13.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                close()
            }
        }.build()

        return _BuildingOne!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingOne: ImageVector? = null
