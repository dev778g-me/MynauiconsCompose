package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.UserX: ImageVector
    get() {
        if (_UserX != null) {
            return _UserX!!
        }
        _UserX = ImageVector.Builder(
            name = "Outline.UserX",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 7.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                moveToRelative(4.5f, 13f)
                curveToRelative(-0.475f, -9.333f, -14.525f, -9.333f, -15f, 0f)
                moveToRelative(6.086f, -3f)
                lineToRelative(2.828f, 2.828f)
                moveToRelative(0f, -2.828f)
                lineToRelative(-2.828f, 2.828f)
            }
        }.build()

        return _UserX!!
    }

@Suppress("ObjectPropertyName")
private var _UserX: ImageVector? = null
