package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Pinterest: ImageVector
    get() {
        if (_Pinterest != null) {
            return _Pinterest!!
        }
        _Pinterest = ImageVector.Builder(
            name = "Outline.Pinterest",
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
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.452f, 13.18f)
                curveToRelative(-1.108f, -2.262f, 0.4f, -6.668f, 5.472f, -5.948f)
                curveToRelative(5.586f, 0.794f, 4.581f, 9.478f, -0.077f, 9.138f)
                curveToRelative(-1.474f, -0.107f, -2.031f, -1.328f, -2.177f, -2.576f)
                moveToRelative(0f, 0f)
                curveToRelative(-0.11f, -0.946f, 0.016f, -1.907f, 0.16f, -2.41f)
                curveToRelative(0.244f, -0.857f, 0.649f, -0.74f, 0.353f, 0.393f)
                curveToRelative(-0.144f, 0.552f, -0.32f, 1.245f, -0.513f, 2.017f)
                moveToRelative(0f, 0f)
                curveToRelative(-0.514f, 2.06f, -1.15f, 4.685f, -1.63f, 6.708f)
            }
        }.build()

        return _Pinterest!!
    }

@Suppress("ObjectPropertyName")
private var _Pinterest: ImageVector? = null
