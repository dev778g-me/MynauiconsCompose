package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.UserCheck: ImageVector
    get() {
        if (_UserCheck != null) {
            return _UserCheck!!
        }
        _UserCheck = ImageVector.Builder(
            name = "Outline.UserCheck",
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
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(10.258f, 18.992f)
                lineToRelative(1.034f, 1.181f)
                curveToRelative(0.095f, 0.109f, 0.266f, 0.1f, 0.35f, -0.016f)
                lineToRelative(2.1f, -2.907f)
            }
        }.build()

        return _UserCheck!!
    }

@Suppress("ObjectPropertyName")
private var _UserCheck: ImageVector? = null
