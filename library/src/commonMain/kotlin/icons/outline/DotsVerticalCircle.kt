package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.DotsVerticalCircle: ImageVector
    get() {
        if (_DotsVerticalCircle != null) {
            return _DotsVerticalCircle!!
        }
        _DotsVerticalCircle = ImageVector.Builder(
            name = "Outline.DotsVerticalCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                moveToRelative(-8.75f, 0f)
                horizontalLineToRelative(-0.5f)
                moveToRelative(0.5f, -4f)
                horizontalLineToRelative(-0.5f)
                moveToRelative(0.5f, 8f)
                horizontalLineToRelative(-0.5f)
            }
        }.build()

        return _DotsVerticalCircle!!
    }

@Suppress("ObjectPropertyName")
private var _DotsVerticalCircle: ImageVector? = null
