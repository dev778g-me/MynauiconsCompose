package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Bank: ImageVector
    get() {
        if (_Bank != null) {
            return _Bank!!
        }
        _Bank = ImageVector.Builder(
            name = "Outline.Bank",
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
                moveTo(12f, 8.94f)
                verticalLineTo(18f)
                moveToRelative(5f, -9.06f)
                verticalLineTo(18f)
                moveTo(7f, 8.94f)
                verticalLineTo(18f)
                moveToRelative(5.447f, -14.894f)
                lineToRelative(7.764f, 3.908f)
                curveToRelative(0.944f, 0.475f, 0.608f, 1.907f, -0.447f, 1.907f)
                horizontalLineTo(4.236f)
                curveToRelative(-1.055f, 0f, -1.391f, -1.432f, -0.447f, -1.907f)
                lineToRelative(7.764f, -3.908f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.894f, 0f)
                moveTo(19.5f, 21f)
                horizontalLineToRelative(-15f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
                horizontalLineToRelative(15f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            }
        }.build()

        return _Bank!!
    }

@Suppress("ObjectPropertyName")
private var _Bank: ImageVector? = null
