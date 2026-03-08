package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ZapOff: ImageVector
    get() {
        if (_ZapOff != null) {
            return _ZapOff!!
        }
        _ZapOff = ImageVector.Builder(
            name = "Filled.ZapOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.493f, 3.659f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.711f, -1.296f)
                arcToRelative(1.195f, 1.195f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.46f, 0.36f)
                lineTo(3.518f, 12.736f)
                arcToRelative(1.28f, 1.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.16f, 1.302f)
                curveToRelative(0.172f, 0.393f, 0.57f, 0.741f, 1.116f, 0.741f)
                horizontalLineTo(8.16f)
                lineToRelative(-5.69f, 5.69f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.061f)
                lineToRelative(6.752f, -6.751f)
                horizontalLineToRelative(0.875f)
                lineToRelative(-0.65f, 5.562f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.711f, 1.296f)
                arcToRelative(1.195f, 1.195f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.46f, -0.36f)
                lineToRelative(7.803f, -10.013f)
                arcToRelative(1.28f, 1.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.16f, -1.302f)
                arcToRelative(1.22f, 1.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.116f, -0.741f)
                horizontalLineTo(15.84f)
                lineToRelative(5.69f, -5.69f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -1.061f)
                lineToRelative(-6.752f, 6.75f)
                horizontalLineToRelative(-0.875f)
                close()
            }
        }.build()

        return _ZapOff!!
    }

@Suppress("ObjectPropertyName")
private var _ZapOff: ImageVector? = null
