package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.YenOctagon: ImageVector
    get() {
        if (_YenOctagon != null) {
            return _YenOctagon!!
        }
        _YenOctagon = ImageVector.Builder(
            name = "Filled.YenOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.037f, 2.408f)
                curveToRelative(-0.299f, 0.122f, -0.54f, 0.31f, -0.762f, 0.53f)
                lineTo(2.938f, 7.275f)
                curveToRelative(-0.213f, 0.214f, -0.4f, 0.45f, -0.525f, 0.748f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.163f, 0.914f)
                verticalLineToRelative(6.126f)
                curveToRelative(0f, 0.302f, 0.036f, 0.602f, 0.158f, 0.9f)
                reflectiveCurveToRelative(0.31f, 0.54f, 0.53f, 0.762f)
                lineToRelative(4.337f, 4.337f)
                curveToRelative(0.214f, 0.213f, 0.45f, 0.4f, 0.748f, 0.524f)
                curveToRelative(0.298f, 0.125f, 0.601f, 0.164f, 0.914f, 0.164f)
                horizontalLineToRelative(6.126f)
                curveToRelative(0.302f, 0f, 0.602f, -0.035f, 0.9f, -0.158f)
                curveToRelative(0.299f, -0.122f, 0.54f, -0.31f, 0.762f, -0.53f)
                lineToRelative(4.337f, -4.337f)
                curveToRelative(0.213f, -0.214f, 0.4f, -0.45f, 0.524f, -0.748f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.164f, -0.914f)
                verticalLineTo(8.937f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.158f, -0.9f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.53f, -0.762f)
                lineToRelative(-4.337f, -4.337f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.762f, -0.53f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.9f, -0.158f)
                horizontalLineTo(8.937f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.9f, 0.158f)
                moveToRelative(0.033f, 4.478f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.044f, 0.184f)
                lineTo(12f, 11.192f)
                lineToRelative(2.886f, -4.122f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.229f, 0.86f)
                lineToRelative(-2.674f, 3.82f)
                horizontalLineToRelative(1.74f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-2.43f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.43f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-2.43f)
                verticalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-1.75f)
                horizontalLineTo(8.817f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(2.432f)
                verticalLineToRelative(-1f)
                horizontalLineTo(8.818f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.742f)
                lineTo(7.886f, 7.93f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.184f, -1.044f)
            }
        }.build()

        return _YenOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _YenOctagon: ImageVector? = null
