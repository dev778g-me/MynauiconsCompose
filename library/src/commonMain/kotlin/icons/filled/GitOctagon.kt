package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.GitOctagon: ImageVector
    get() {
        if (_GitOctagon != null) {
            return _GitOctagon!!
        }
        _GitOctagon = ImageVector.Builder(
            name = "Filled.GitOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10.75f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.5f)
            }
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
                moveToRelative(1.317f, 8.842f)
                arcToRelative(2.751f, 2.751f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.293f, 0f)
                horizontalLineTo(17f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-2.354f)
                arcToRelative(2.751f, 2.751f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.292f, 0f)
                horizontalLineTo(7f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                close()
            }
        }.build()

        return _GitOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _GitOctagon: ImageVector? = null
