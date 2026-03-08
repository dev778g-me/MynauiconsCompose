package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CornerRightDown: ImageVector
    get() {
        if (_CornerRightDown != null) {
            return _CornerRightDown!!
        }
        _CornerRightDown = ImageVector.Builder(
            name = "Outline.CornerRightDown",
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
                moveTo(13.973f, 19f)
                verticalLineTo(9f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                horizontalLineTo(5f)
                moveToRelative(8.973f, 14f)
                lineToRelative(-5.027f, -4.78f)
                moveTo(13.973f, 19f)
                lineTo(19f, 14.22f)
            }
        }.build()

        return _CornerRightDown!!
    }

@Suppress("ObjectPropertyName")
private var _CornerRightDown: ImageVector? = null
