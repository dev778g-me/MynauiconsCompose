package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.HashOctagon: ImageVector
    get() {
        if (_HashOctagon != null) {
            return _HashOctagon!!
        }
        _HashOctagon = ImageVector.Builder(
            name = "Filled.HashOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.769f, 13f)
                horizontalLineToRelative(1.976f)
                lineToRelative(0.359f, -2f)
                horizontalLineToRelative(-1.976f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.937f, 2.25f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.9f, 0.158f)
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
                lineTo(21.75f, 8.937f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.158f, -0.9f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.53f, -0.762f)
                lineToRelative(-4.337f, -4.337f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.762f, -0.53f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.9f, -0.158f)
                close()
                moveTo(11.037f, 7.262f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.606f, 0.87f)
                lineTo(11.397f, 9.5f)
                horizontalLineToRelative(1.976f)
                lineToRelative(0.293f, -1.633f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.477f, 0.266f)
                lineTo(14.897f, 9.5f)
                horizontalLineToRelative(1.385f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1.654f)
                lineToRelative(-0.36f, 2f)
                horizontalLineToRelative(2.014f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                lineTo(14f, 14.5f)
                lineToRelative(-0.293f, 1.633f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.477f, -0.265f)
                lineToRelative(0.246f, -1.368f)
                lineTo(10.5f, 14.5f)
                lineToRelative(-0.293f, 1.633f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.477f, -0.265f)
                lineToRelative(0.246f, -1.368f)
                lineTo(7.718f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(1.527f)
                lineToRelative(0.359f, -2f)
                lineTo(7.718f, 11f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(2.155f)
                lineToRelative(0.293f, -1.633f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.871f, -0.605f)
            }
        }.build()

        return _HashOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _HashOctagon: ImageVector? = null
