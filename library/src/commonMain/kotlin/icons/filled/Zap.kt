package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Zap: ImageVector
    get() {
        if (_Zap != null) {
            return _Zap!!
        }
        _Zap = ImageVector.Builder(
            name = "Filled.Zap",
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
                horizontalLineToRelative(6.682f)
                lineToRelative(-0.65f, 5.562f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.711f, 1.296f)
                arcToRelative(1.195f, 1.195f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.46f, -0.36f)
                lineToRelative(7.803f, -10.013f)
                arcToRelative(1.28f, 1.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.16f, -1.302f)
                arcToRelative(1.22f, 1.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.116f, -0.741f)
                horizontalLineToRelative(-6.682f)
                close()
            }
        }.build()

        return _Zap!!
    }

@Suppress("ObjectPropertyName")
private var _Zap: ImageVector? = null
