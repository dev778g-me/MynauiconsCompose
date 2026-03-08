package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FatCornerRightDown: ImageVector
    get() {
        if (_FatCornerRightDown != null) {
            return _FatCornerRightDown!!
        }
        _FatCornerRightDown = ImageVector.Builder(
            name = "Filled.FatCornerRightDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.15f, 2.253f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.535f, 1.337f)
                curveTo(6.408f, 5.778f, 7.812f, 7.594f, 8.13f, 9.028f)
                curveToRelative(0.309f, 1.393f, 0.39f, 2.714f, 0.252f, 3.969f)
                horizontalLineTo(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.496f, 1.312f)
                lineToRelative(8.214f, 7.253f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.007f, -0.013f)
                lineToRelative(7.786f, -7.253f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.511f, -1.3f)
                horizontalLineToRelative(-4.063f)
                curveToRelative(-0.194f, -2.747f, -1.342f, -5.118f, -3.422f, -7.08f)
                curveTo(10.262f, 3.79f, 7.46f, 2.574f, 4.15f, 2.252f)
            }
        }.build()

        return _FatCornerRightDown!!
    }

@Suppress("ObjectPropertyName")
private var _FatCornerRightDown: ImageVector? = null
